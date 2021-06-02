package com.ruslan.trafficlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    /* объявил глобальные переменные */
    private LinearLayout b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9; /* переменные */
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
        b_4 = findViewById(R.id.bulb_4); /* привязка элементов экрана */
        b_5 = findViewById(R.id.bulb_5); /* привязка элементов экрана */
        b_6 = findViewById(R.id.bulb_6); /* привязка элементов экрана */
        b_7 = findViewById(R.id.bulb_7); /* привязка элементов экрана */
        b_8 = findViewById(R.id.bulb_8); /* привязка элементов экрана */
        b_9 = findViewById(R.id.bulb_9); /* привязка элементов экрана */
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
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 2: /* событие при значении счётчика = 2 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.yellow));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 3: /* событие при значении счётчика = 3 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.green));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 4: /* событие при значении счётчика = 4 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.red));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 5: /* событие при значении счётчика = 5 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.yellow));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 6: /* событие при значении счётчика = 6 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.green));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 7: /* событие при значении счётчика = 7 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.red));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 8: /* событие при значении счётчика = 8 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.yellow));
                            b_9.setBackgroundColor(getResources().getColor(R.color.grey));
                            break;
                        case 9: /* событие при значении счётчика = 9 */
                            b_1.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_2.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_3.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_4.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_5.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_6.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_7.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_8.setBackgroundColor(getResources().getColor(R.color.grey));
                            b_9.setBackgroundColor(getResources().getColor(R.color.green));
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