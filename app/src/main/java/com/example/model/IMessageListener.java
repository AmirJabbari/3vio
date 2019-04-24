package com.example.model;

import java.util.List;

public interface IMessageListener {

    public void onSuccess(List<Ads> AdsList);
    public void onError(String errorResponse);
}
