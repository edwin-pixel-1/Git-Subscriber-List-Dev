package com.edwincobos.subscribersapp.subscriberslist;

import android.os.Bundle;

import com.edwincobos.subscribersapp.R;
import com.edwincobos.subscribersapp.commons.abstracts.AbstractActivity;

public class SubscribersListActivity extends AbstractActivity implements SubscribersListView {

    private SubscribersListPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribers_list);

        presenter = new SubscribersListPresenterImp(this);
    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void navigateToUserDetail() {

    }
}