package com.example.grobak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import com.example.grobak.Navbar.Navbar;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "RegisterActivity";
    private FirebaseAuth mAuth;
    public String email;
    public String password;

    @BindView(R.id.email_layout)
    TextInputLayout txtEmail;

    @BindView(R.id.username_layout)
    TextInputLayout txtUsername;

    @BindView(R.id.password_layout)
    TextInputLayout txtPassword;

    @BindView(R.id.btn_buat_akun)
    MaterialButton btn_buat_akun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    private void registerUser(){
        email = txtEmail.getEditText().getText().toString().trim();
        password = txtPassword.getEditText().getText().toString().trim();
        if(email.isEmpty())
        {
            txtEmail.getEditText().setError("Email harus diisi!");
            txtEmail.getEditText().requestFocus();
            return ;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            txtEmail.setError("Mohon masukkan alamat email yang benar!");
            txtEmail.getEditText().requestFocus();
            return;
        }

        if(password.isEmpty())
        {
            txtPassword.getEditText().setError("Password harus diisi!");
            txtPassword.getEditText().requestFocus();
            return ;
        }

        if(password.length() < 6)
        {
            txtPassword.setError("Panjang minimal password adalah 6 karakter!");
            txtPassword.getEditText().requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(task.getException() instanceof FirebaseAuthUserCollisionException)
                    {
                        Toast.makeText(getApplicationContext(), "Alamat Email sudah terdaftar", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @OnClick(R.id.btn_buat_akun)
    void makeAccount()
    {
        registerUser();
    }

    @Override
    public void onClick(View v) {
    }
}
