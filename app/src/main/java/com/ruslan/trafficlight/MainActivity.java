package com.ruslan.trafficlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    /* объявил глобальные переменные */
    private LinearLayout b_1, b_2, b_3; /* переменные */
    private Button button_1; /* переменные */
    private boolean start_stop = false; /* переменные */
    private int counter = 0; /* переменные */

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); /* цикл жизни активити */
        setContentView(R.layout.activity_main);
        b_1 = findViewById(R.id.bulb_1); /* привязка элементов экрана */
        b_2 = findViewById(R.id.bulb_2); /* привязка элементов экрана */
        b_3 = findViewById(R.id.bulb_3); /* привязка элементов экрана */
        button_1 = findViewById(R.id.button1); /* переменные */
    }
    public void onClickStart(View view) { /* событие на нажатие кнопки */
        if(!start_stop) {
            button_1.setText("Stop"); /* менятель текста кнопки */
            start_stop = true;
            new Thread ((Runnable) () -> { /* создал новый поток потому что использую цикл */
                while (start_stop) {
                    counter++; /* увеличивает значение счётчика на 1 */
                    switch(counter) { /* оператор выбора, смотрит на счётчик counter */
                        case 1: /* событие при значении счётчика = 1 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.red));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 2: /* событие при значении счётчика = 2 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.yellow));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 3: /* событие при значении счётчика = 3 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.green));
                            counter = 0; /* обнуление счётчика перед началом цикла */
                            break;
                    }
                    try { /* try catch - являются перехватчиками ошибок */
                        Thread.sleep(200); /* цикл, длина выполнения миллисекунды */
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } else {
            start_stop = false;
            button_1.setText("Start"); /* менятель текста кнопки */
        }
    }

    @Override
    protected void onDestroy() { /* цикл жизни активити, останавливает цикл при закрытии приложения */
        super.onDestroy();
        start_stop = false;
    }
}