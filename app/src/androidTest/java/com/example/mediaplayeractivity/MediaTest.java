package com.example.mediaplayeractivity;


import android.os.Bundle;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)

public class MediaTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Before
    public void yourSetUPFragment() {
        /* We defined this method to do anything we want to do before the test, in this example we want to test the views inside PlayerFragment
        /So, we should load that fragment first in the MainActivity (represented by activityTestRule above)*/
        //TODO 6: (a) Define an object of PlayerFragment
        //TODO 6: (b) Create a bundle and add the data you want to send to that fragment (in this case the int position of the phrase and the phrase itself), let's use "How are you" phrase for this example
        //Note the keys of the values you'll add to the Bundle should match the keys that PlayerFragment uses to get values from that Bundle

        //TODO 7: Send the Bundle you created and filled above to PlayerFragment through setArguments


        /* Now we simply call getActivity then getSupportFragmentManager to add PlayerFragment as below. Note how we use replace not add,
        because if add will be used PlayerFragment will show above the Fragment that gets loaded by default in the activity (MainFragment), you can try to use add to understand more.*/
        activityTestRule.getActivity()
                .getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame, playerFragment).commit();
    }

    // TODO 8: Write a test method using @Test, to test PlayerFragment UI
    @Test
    public void buttonShouldUpdateText() {
        //TODO 8 (a): Check that the view with the id phrase exists in the hierarchy and is displayed on the screen:

        //TODO 8 (b): Perform a click action on any of the views in PlayerFragment (for example the view with the id eng) and observe the test result
        // You can also add more lines to perform click actions on the remaining views (with ids fr and ar) and observe the test result

    }
}
