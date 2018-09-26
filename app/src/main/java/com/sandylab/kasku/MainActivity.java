package com.sandylab.kasku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import io.realm.Realm;
import me.grantland.widget.AutofitTextView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tvBalance)
    AutofitTextView tvBalance;
    @BindView(R.id.tvExpense)
    AutofitTextView tvExpense;
    @BindView(R.id.tvIncome)
    AutofitTextView tvIncome;

    Realm mRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        mRealm = Realm.getDefaultInstance();

    }
}
