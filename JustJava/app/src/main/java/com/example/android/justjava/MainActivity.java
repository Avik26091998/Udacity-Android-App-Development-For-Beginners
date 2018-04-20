package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/*
    This app displays an order form to order coffee
*/

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        This method is called when order button is clicked
     */

    public void submitOrder(View view){

          int noofcoffees = quantity;
//        display(quantity);
//        displayPrice(noofcoffees * 10);

          String priceMessage = "Free";
          displayMessage("Total is - $" + noofcoffees * 10 + "\nTHANK YOU!!!!");
    }

    /**
     * This method increments the value
     */

    public void increment(View view){


        quantity += 1;
        display(quantity);

    }

    /**
     * This method decrements the value
     */

    public void decrement(View view){

        if(quantity != 0) {
            quantity -= 1;
            display(quantity);
        }
    }

    /**
     * This method displays the quantity on the screen
     */


    private void display(int number){

        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This Method displays the message on the screen
     */
    private void displayMessage(String message){

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
