package com.example.grobak.IntroPage;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import com.example.grobak.R;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

public class IntroActivity extends AppIntro {

    AppIntroFragment FirstFragment = new AppIntroFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(CustomFragment.newInstance(R.layout.fragment_first));
//        addSlide(secondFragment);
//        addSlide(thirdFragment);
//        addSlide(fourthFragment);

        // Instead of fragments, you can also use our default slide.
        // Just create a `SliderPage` and provide title, description, background and image.
        // AppIntro will do the rest.
//        SliderPage sliderPage1 = new SliderPage();
//        sliderPage1.setTitle("");
//        sliderPage1.setDescription(getString(R.string.intro1desc));
//        sliderPage1.setImageDrawable(R.drawable.fragment1);
//        sliderPage1.setBgColor(Color.parseColor("#FFFFFF"));
//        addSlide(AppIntroFragment.newInstance(sliderPage1));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button.
        showSkipButton(false);
        showDoneButton(false);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSlideChanged() {
        super.onSlideChanged();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
    }

    @Override
    public void onDonePressed() {
        super.onDonePressed();
    }
}
