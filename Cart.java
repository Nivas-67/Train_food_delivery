package com.example.new_one;

import static com.example.new_one.home.chick;
import static com.example.new_one.home.choco;
import static com.example.new_one.home.dosa;
import static com.example.new_one.home.idly;
import static com.example.new_one.home.idly_s;
import static com.example.new_one.home.lime;
import static com.example.new_one.home.mlassi;
import static com.example.new_one.home.mutt;
import static com.example.new_one.home.nmeals;
import static com.example.new_one.home.orange;
import static com.example.new_one.home.paratha;
import static com.example.new_one.home.poori;
import static com.example.new_one.home.pulav;
import static com.example.new_one.home.smeals;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cart extends AppCompatActivity {
    TextView tax,item_p,delivery_p,total_p;
    EditText seatnum;
    double each_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        tax = findViewById(R.id.tax_p);
        delivery_p = findViewById(R.id.deliver_p);
        total_p = findViewById(R.id.total_p);
        item_p = findViewById(R.id.item_p);
        seatnum = findViewById(R.id.seatnum);
        int code = getIntent().getIntExtra(idly_s,0);
        if(code==idly){
            adder();
        } else if (code==dosa) {
            adder1();
        } else if (code==poori) {
            adder2();
        } else if (code==paratha) {
            adder3();
        } else if (code==chick) {
            adder4();
        } else if (code==mutt) {
            adder5();
        } else if (code==smeals) {
            adder6();
        } else if (code==nmeals) {
            adder7();
        } else if (code==pulav) {
            adder8();
        } else if (code==mlassi) {
            adder9();
        } else if (code==lime) {
            adder10();
        } else if (code==orange) {
            adder11();
        } else if (code==choco) {
            adder12();
        }
        finals(new View(this));
    }
    public void adder(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("idly","Empty");
        double new_p = Double.parseDouble(bf);
        each_p += new_p;
        item_p.setText(String.valueOf(each_p));
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(50.0)));
    }

    public void adder1(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("dosa","Empty");
        double new_p = Double.parseDouble(bf);
        each_p += new_p;
        item_p.setText(String.valueOf(each_p));
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(70.0)));
    }
    public void adder2(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("poori","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(50.0)));
    }
    public void adder3(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("paratha","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(60.0)));
    }
    public void adder4(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("chick","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(150.0)));
    }
    public void adder5(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("mutt","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(180.0)));
    }
    public void adder6(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("smeals","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(80.0)));
    }
    public void adder7(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("nmeals","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(90.0)));
    }
    public void adder8(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("pulav","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(80.0)));
    }public void adder9(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("mlassi","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(50.0)));
    }
    public void adder10(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("lime","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(30.0)));
    }
    public void adder11(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("orange","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(40.0)));
    }
    @SuppressLint("SetTextI18n")
    public void adder12(){
        String bf = getSharedPreferences("cart", Context.MODE_PRIVATE).getString("choco","Empty");
        item_p.setText(bf);
        delivery_p.setText("0.0");
        tax.setText("0.0");
        total_p.setText(String.valueOf(total(50.0)));
    }
    public void finals(View view){
        String new1 = getSharedPreferences("cart",Context.MODE_PRIVATE).getAll().toString();
        Toast.makeText(this, new1, Toast.LENGTH_SHORT).show();
    }
    @SuppressLint("CommitPrefEdits")
    public void checkout(View v){
        int num = Integer.parseInt(seatnum.getText().toString());
        if(seatnum.getText().toString().isEmpty()){
            Toast.makeText(this, "Please fill your seat number", Toast.LENGTH_SHORT).show();
            return;
        }
//        if(Integer.parseInt(total_p.getText().toString())<20){
//            Toast.makeText(this, "Your Cart is Empty", Toast.LENGTH_SHORT).show();
//            return;
//        }
        if(num>=1 && num <=600) {
            getSharedPreferences("cart", MODE_PRIVATE).edit().clear().apply();
            Intent i = new Intent(this, home.class);
            Toast.makeText(this, "Delivering to your seat in 10 minutes", Toast.LENGTH_LONG).show();
            startActivity(i);
        }
        else if (num>=600){
            Toast.makeText(this, "Enter the correct seat number", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Enter the correct seat number", Toast.LENGTH_SHORT).show();
        }
    }
    public double total(double num){
        return num + 10.0 + 5.0;
    }
}