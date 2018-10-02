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

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnEquals, btnAdd, p2e, e2p;
    private TextView screen;
    private int val1 = 0, val2 = 0;
    private String TAG_DEBUG = "DEBUG LABEL";
    private final static double euro_value = 166.386;
    String reserva, operador, mostrar;
    private int resultado;

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

        e2p = view.findViewById(R.id.e2p);
        p2e = view.findViewById(R.id.p2e);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!screen.getText().toString().equals(""))
                {
                    //Log.d(TAG_DEBUG, "El valor de screen es: " + screen.getText().toString());
                    screen.append("0");
                }
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
                val1 = 0;
                val2 = 0;
            }
        });

        e2p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!screen.getText().toString().equals("")) {
                    double eur = Double.parseDouble(screen.getText().toString());
                    double result = eur * euro_value;
                    screen.setText("");
                    screen.setText(String.valueOf(result));
                }
            }
        });

        p2e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!screen.getText().toString().equals("")) {
                    double eur = Double.parseDouble(screen.getText().toString());
                    double result = eur / euro_value;
                    screen.setText("");
                    screen.setText(String.valueOf(result));
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddOperation();
                //screen.setText(Integer.toString(val1));
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = screen.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Integer.parseInt(reserva) -Integer.parseInt(screen.getText().toString());
                    screen.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Integer.parseInt(reserva) + Integer.parseInt(screen.getText().toString());
                    screen.setText(String.valueOf(resultado));
                    Log.d(TAG_DEBUG, "Valor " + String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Integer.parseInt(reserva) / Integer.parseInt(screen.getText().toString());
                    screen.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Integer.parseInt(reserva) * Integer.parseInt(screen.getText().toString());
                    screen.setText(String.valueOf(resultado));
                }
            }
        });
        return view;
    }

    private void AddOperation() {
        if (!screen.getText().toString().equals("")) {
            reserva = screen.getText().toString();
            operador = "+";
            screen.setText("");
        }
    }
}
