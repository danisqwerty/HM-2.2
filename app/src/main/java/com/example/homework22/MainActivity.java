package com.example.homework22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  double telescopePrice = 14000;
  double account = 1000;
  double stipend =2500;
  double percentBankMonth = 5.0/12.0;
  int countMonth = 0;
    {
        while (account < telescopePrice)
        {

            account += account * percentBankMonth/100;
            account += stipend;
        }
        double countMonth=(account-1000)/2500;

    }
    private TextView countOut; // поле о возможности покупки
    private TextView manyMonthOut; // поле месяцев

    @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

        countOut = findViewById(R.id.countOut); // вывод информации денег
        manyMonthOut = findViewById(R.id.manyMonthOut); // вывод информации по количеству месяцев

        // запонение экрана
        // 1) вывод о возможности покупки
        countOut.setText("Средств для покупки телескопа достаточно " + (account + " монет") );
       // 3) вывод количества месяцев
        manyMonthOut.setText("Для накопления денег для покупки телескопа потребуется " + (account-1000)/2500 + " месяцев" );
    }
}

