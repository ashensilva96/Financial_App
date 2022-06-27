package com.example.financialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SetlimitActivity extends AppCompatActivity {

    private TextView amountCurrent_food, amountCurrent_Utility, amountCurrent_health, amountCurrent_Other;
    private EditText et_setLimitFood, et_setLimitUtility, et_setLimitHealth, et_setLimitOther;
    private Button btn_addFood, btn_addUtility, btn_addHealth, btn_addOther;

    private FirebaseAuth mAuth;
    private DatabaseReference dbRef;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setlimit);

        mAuth = FirebaseAuth.getInstance();
        dbRef = FirebaseDatabase.getInstance().getReference().child("BudgetLimit").child(mAuth.getCurrentUser().getUid());

        amountCurrent_food = findViewById(R.id.amountCurrent_food);
        amountCurrent_Utility = findViewById(R.id.amountCurrent_Utility);
        amountCurrent_health = findViewById(R.id.amountCurrent_health);
        amountCurrent_Other = findViewById(R.id.amountCurrent_Other);

        et_setLimitFood = findViewById(R.id.et_setLimitFood);
        et_setLimitUtility = findViewById(R.id.et_setLimitUtility);
        et_setLimitHealth = findViewById(R.id.et_setLimitHealth);
        et_setLimitOther = findViewById(R.id.et_setLimitOther);

        btn_addFood = findViewById(R.id.btn_addFood);
        btn_addUtility = findViewById(R.id.btn_addUtility);
        btn_addHealth = findViewById(R.id.btn_addHealth);
        btn_addOther = findViewById(R.id.btn_addOther);

        btn_addFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFoodLimit();
            }
        });

    }

    private void addFoodLimit() {
        String foodLimitString = et_setLimitFood.getText().toString();
    }
}