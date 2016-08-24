package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.Subscriber;

import java.util.List;

/**
 * Interface SubscribersListInteractor that represents interactor class(Model) to deliver the data to presenter.
 * @author edwin.cobos
 * @since 19/08/2016
 */
public interface SubscribersListInteractor {
    interface OnFinishedListener {
        void onFinished(List<Subscriber> listItems);
    }

    void getSubscribersDataList(OnFinishedListener listener);

}