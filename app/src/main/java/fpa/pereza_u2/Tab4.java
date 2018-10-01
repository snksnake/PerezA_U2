package fpa.pereza_u2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab4 extends Fragment {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnEquals, btnAdd;
    private TextView screen;
    private int val1 = 0, val2 = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab4_view, container, false);
        btn0 = view.findViewById(R.id.number_zero);
        btn1 = view.findViewById(R.id.number_one);
        btn2 = view.findViewById(R.id.number_two);
        btn3 = view.findViewById(R.id.number_three);
        btn4 = view.findViewById(R.id.number_four);
        btn5 = view.findViewById(R.id.number_five);
        btn6 = view.findViewById(R.id.number_six);
        btn7 = view.findViewById(R.id.number_seven);
        btn8 = view.findViewById(R.id.number_eight);
        btn9 = view.findViewById(R.id.number_nine);
        btnClear = view.findViewById(R.id.clear_btn);
        btnEquals = view.findViewById(R.id.equals_btn);
        btnAdd = view.findViewById(R.id.add_btn);
        screen = view.findViewById(R.id.operations);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (screen.getText() != "")
                    screen.append("0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("9");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AddOperation();
                screen.setText(Integer.toString(val1));

            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EqualOperation();
            }
        });
        return view;
    }

    private void AddOperation() {
        if (screen.getText() != "") {
            val2 = Integer.parseInt(screen.getText().toString());
            val1 += val2;
            screen.setText("");
        }
    }

    private void EqualOperation() {
        if (screen.getText() != "") {
            val1 += Integer.parseInt(screen.getText().toString());
            screen.setText(val1);
        }
    }
}
