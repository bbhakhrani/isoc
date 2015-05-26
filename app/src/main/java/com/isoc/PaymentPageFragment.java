package com.isoc;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class PaymentPageFragment extends Fragment {

    public PaymentPageFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String amountStr = getActivity().getIntent().getExtras().getString("amount");
        float amount = Float.parseFloat(amountStr);


        return inflater.inflate(R.layout.fragment_payment_page, container, false);
    }

}
