package io.neverstoplearning.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;

import io.neverstoplearning.advancedandroid.R;
import io.neverstoplearning.advancedandroid.base.BaseActivity;
import io.neverstoplearning.advancedandroid.trending.TrendingReposController;

public class MainActivity extends BaseActivity {
    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
