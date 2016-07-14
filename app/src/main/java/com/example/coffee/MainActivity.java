package com.example.coffee;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.priceTextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantity = 2;
    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity * 5);
    }
    public void increment(View view) {

        quantity = quantity+1;


        display(quantity);

    }
    public void decrement(View view) {
        if(quantity>0)
        quantity = quantity-1;
        display(quantity);

    }
    public void reset (View view) {

            quantity = 0;
        display(quantity);
        displayPrice(0);

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantityTextView);
        quantityTextView.setText("" + number);
    }

}