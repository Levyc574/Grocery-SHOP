package com.example.robsons;


import static android.widget.Toast.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button  buttonC, button5, button6, button7, button8, button9, button10, button11, button12, button13, button15;
    TextView  textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12,
            textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind The Values
        buttonC = findViewById(R.id.buttonC);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button15 = findViewById(R.id.button15);

        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView35);
        textView5 = findViewById(R.id.textView36);
        textView6 = findViewById(R.id.textView37);
        textView7 = findViewById(R.id.textView38);
        textView8 = findViewById(R.id.textView27);
        textView9 = findViewById(R.id.textView28);
        textView10 = findViewById(R.id.textView29);
        textView11 = findViewById(R.id.textView30);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        textView14 = findViewById(R.id.textView14);
        textView15 = findViewById(R.id.textView15);
        textView16 = findViewById(R.id.textView16);
        textView18 = findViewById(R.id.textView18);
        textView19 = findViewById(R.id.textView40);
        textView20 = findViewById(R.id.textView44);

        // Addition for Milk

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String milkPrice = textView4.getText().toString();
                String milkQuantity = textView8.getText().toString();
                String milkAmount = textView13.getText().toString();

                Integer m_price = Integer.parseInt(milkPrice);
                Integer m_quantity = Integer.parseInt(milkQuantity);
                Integer m_amount = Integer.parseInt(milkAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if (m_quantity < 1) {
                    m_quantity++;
                    textView8.setText(m_quantity.toString());

                    Integer total = m_price;
                    textView13.setText(total.toString());

                } else if (m_quantity < 4 && m_quantity > 0) {
                    /* Integer total = m_price * m_quantity;
                    textView13.setText(total.toString());
                    m_quantity++;
                    textView8.setText(m_quantity.toString()); */

                    m_quantity++;
                    textView8.setText(m_quantity.toString());

                    Integer total = m_price + m_amount;
                    textView13.setText(total.toString());

                }else {
                    return;
                }
            }
        });

        // Subtraction for Milk

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String milkPrice = textView4.getText().toString();
                String milkQuantity = textView8.getText().toString();
                String milkAmount = textView13.getText().toString();

                Integer m_price = Integer.parseInt(milkPrice);
                Integer m_quantity = Integer.parseInt(milkQuantity);
                Integer m_amount = Integer.parseInt(milkAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if ( m_quantity > 0) {
                    Integer total = m_amount - m_price;
                    textView13.setText(total.toString());

                    m_quantity--;
                    textView8.setText(m_quantity.toString());

                }else {
                    return;
                }
            }
        });

        // Addition for Bread

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String breadPrice = textView5.getText().toString();
                String breadQuantity = textView9.getText().toString();
                String breadAmount = textView14.getText().toString();

                Integer b_price = Integer.parseInt(breadPrice);
                Integer b_quantity = Integer.parseInt(breadQuantity);
                Integer b_amount = Integer.parseInt(breadAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if (b_quantity < 1) {
                    b_quantity++;
                    textView9.setText(b_quantity.toString());

                    Integer total = b_price;
                    textView14.setText(total.toString());

                } else if (b_quantity < 4 && b_quantity > 0) {
                    b_quantity++;
                    textView9.setText(b_quantity.toString());

                    Integer total = b_price + b_amount;
                    textView14.setText(total.toString());

                }else {
                    return;
                }
            }
        });

        // Subtraction for Bread

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String breadPrice = textView5.getText().toString();
                String breadQuantity = textView9.getText().toString();
                String breadAmount = textView14.getText().toString();

                Integer b_price = Integer.parseInt(breadPrice);
                Integer b_quantity = Integer.parseInt(breadQuantity);
                Integer b_amount = Integer.parseInt(breadAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if ( b_quantity > 0) {
                    Integer total = b_amount - b_price;
                    textView14.setText(total.toString());

                    b_quantity--;
                    textView9.setText(b_quantity.toString());

                }else {
                    return;
                }
            }
        });

        // Addition for Eggs

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eggPrice = textView6.getText().toString();
                String eggQuantity = textView10.getText().toString();
                String eggAmount = textView15.getText().toString();

                Integer e_price = Integer.parseInt(eggPrice);
                Integer e_quantity = Integer.parseInt(eggQuantity);
                Integer e_amount = Integer.parseInt(eggAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if (e_quantity < 1) {
                    e_quantity++;
                    textView10.setText(e_quantity.toString());

                    Integer total = e_price;
                    textView15.setText(total.toString());

                } else if (e_quantity < 4 && e_quantity > 0) {
                    e_quantity++;
                    textView10.setText(e_quantity.toString());

                    Integer total = e_price + e_amount;
                    textView15.setText(total.toString());

                }else {
                    return;
                }
            }
        });

        // Subtraction of Eggs

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eggPrice = textView6.getText().toString();
                String eggQuantity = textView10.getText().toString();
                String eggAmount = textView15.getText().toString();

                Integer m_price = Integer.parseInt(eggPrice);
                Integer m_quantity = Integer.parseInt(eggQuantity);
                Integer m_amount = Integer.parseInt(eggAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if ( m_quantity > 0) {
                    Integer total = m_amount - m_price;
                    textView15.setText(total.toString());

                    m_quantity--;
                    textView10.setText(m_quantity.toString());

                }else {
                    return;
                }
            }
        });

        // Addition for Flour

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flourPrice = textView7.getText().toString();
                String flourQuantity = textView11.getText().toString();
                String flourAmount = textView16.getText().toString();

                Integer f_price = Integer.parseInt(flourPrice);
                Integer f_quantity = Integer.parseInt(flourQuantity);
                Integer f_amount = Integer.parseInt(flourAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if (f_quantity < 1) {
                    f_quantity++;
                    textView11.setText(f_quantity.toString());

                    Integer total = f_price;
                    textView16.setText(total.toString());

                } else if (f_quantity < 4 && f_quantity > 0) {
                    f_quantity++;
                    textView11.setText(f_quantity.toString());

                    Integer total = f_price + f_amount;
                    textView16.setText(total.toString());

                }else {
                    return;
                }
            }
        });

        // Subtraction of Flour

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String flourPrice = textView7.getText().toString();
                String flourQuantity = textView11.getText().toString();
                String flourAmount = textView16.getText().toString();

                Integer f_price = Integer.parseInt(flourPrice);
                Integer f_quantity = Integer.parseInt(flourQuantity);
                Integer f_amount = Integer.parseInt(flourAmount);

                // I'm guessing it's starting from 0 going all the way to 3...meaning 4 steps
                if ( f_quantity > 0) {
                    Integer total = f_amount - f_price;
                    textView16.setText(total.toString());

                    f_quantity--;
                    textView11.setText(f_quantity.toString());

                }else {
                    return;
                }
            }
        });

        // Sub-Total sum

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sum for the total quantity

                String totalQuantity = textView18.getText().toString();
                String totalMilk = textView8.getText().toString();
                String totalBread = textView9.getText().toString();
                String totalEggs = textView10.getText().toString();
                String totalFlour = textView11.getText().toString();

                Integer t_quantity = Integer.parseInt(totalQuantity);
                Integer t_milk = Integer.parseInt(totalMilk);
                Integer t_bread = Integer.parseInt(totalBread);
                Integer t_eggs = Integer.parseInt(totalEggs);
                Integer t_flour = Integer.parseInt(totalFlour);

                Integer total = t_milk + t_bread + t_eggs + t_flour;
                textView18.setText(total.toString());

                // Sum for the Total Amount

                String totalAmount = textView20.getText().toString();
                String totalAmtMilk = textView13.getText().toString();
                String totalAmtBread = textView14.getText().toString();
                String totalAmtEggs = textView15.getText().toString();
                String totalAmtFlour = textView16.getText().toString();
                String netTotal = textView19.getText().toString();

                Integer t_amount = Integer.parseInt(totalAmount);
                Integer t_amt_milk = Integer.parseInt(totalAmtMilk);
                Integer t_amt_bread = Integer.parseInt(totalAmtBread);
                Integer t_amt_eggs = Integer.parseInt(totalAmtEggs);
                Integer t_amt_flour = Integer.parseInt(totalAmtFlour);
                Integer n_total = Integer.parseInt(netTotal);

                Integer amount_total = t_amt_milk + t_amt_bread + t_amt_eggs + t_amt_flour;
                textView20.setText(amount_total.toString());
                textView19.setText(amount_total.toString());
            }
        });



        // Clearing the System

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String milkQuantity = textView8.getText().toString();
                String milkAmount = textView13.getText().toString();
                String breadQuantity = textView9.getText().toString();
                String breadAmount = textView14.getText().toString();
                String eggQuantity = textView10.getText().toString();
                String eggAmount = textView15.getText().toString();
                String flourQuantity = textView11.getText().toString();
                String flourAmount = textView16.getText().toString();
                String totalQuantity = textView18.getText().toString();
                String totalAmount = textView20.getText().toString();
                String netTotal = textView19.getText().toString();

                Integer m_quantity = Integer.parseInt(milkQuantity);
                Integer m_amount = Integer.parseInt(milkAmount);
                Integer b_quantity = Integer.parseInt(breadQuantity);
                Integer b_amount = Integer.parseInt(breadAmount);
                Integer e_quantity = Integer.parseInt(eggQuantity);
                Integer e_amount = Integer.parseInt(eggAmount);
                Integer f_quantity = Integer.parseInt(flourQuantity);
                Integer f_amount = Integer.parseInt(flourAmount);
                Integer t_quantity = Integer.parseInt(totalQuantity);
                Integer t_amount = Integer.parseInt(totalAmount);
                double n_total = Double.parseDouble(netTotal);

                Integer zero = 0;

                textView8.setText(zero.toString());
                textView13.setText(zero.toString());
                textView9.setText(zero.toString());
                textView14.setText(zero.toString());
                textView10.setText(zero.toString());
                textView15.setText(zero.toString());
                textView11.setText(zero.toString());
                textView16.setText(zero.toString());
                textView18.setText(zero.toString());
                textView20.setText(zero.toString());
                textView19.setText(zero.toString());

            }
        });
        Toast.makeText(this, "Purchase successful", LENGTH_SHORT).show();


        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }

        });
    }
}