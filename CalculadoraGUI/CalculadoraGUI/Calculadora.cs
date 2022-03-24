using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CalculadoraGUI
{
    public partial class Calculadora : Form {

        int primerNumero;
        int segundoNumero;
        String operador;

        public Calculadora()
        {
            InitializeComponent();
        }

        Clases.Division division = new Clases.Division();
        Clases.Multiplicacion multiplicacion = new Clases.Multiplicacion();
        Clases.Potencia potencia = new Clases.Potencia();  
        Clases.Resta resta = new Clases.Resta();
        Clases.Suma suma = new Clases.Suma();   


        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void boton_0_Click(object sender, EventArgs e)
        {
            if(display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "0";
                }
            }
        }

        private void boton_1_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if(display.Text.Length > 20)
                {
                    MessageBox.Show(display,"Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "1";
                }

                
            }
        }

        private void boton_2_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "2";
                }
            }
        }

        private void boton_3_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "3";
                }
            }
        }

        private void boton_4_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "4";
                }
            }
        }

        private void boton_5_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "5";
                }
            }
        }

        private void boton_6_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "6";
                }
            }
        }

        private void boton_7_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "7";
                }
            }
        }

        private void boton_8_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "8";
                }
            }
        }

        private void boton_9_Click(object sender, EventArgs e)
        {
            if (display.Text == "1234567890")
            {
                display.Text = "";
            }
            else
            {
                if (display.Text.Length > 20)
                {
                    MessageBox.Show(display, "Desbordamiento de memoria");
                    display.Text = "";
                }
                else
                {
                    display.ForeColor = Color.Black;
                    display.Text = display.Text + "9";
                }
            }
        }

        //Botones de opciones

        private void boton_suma_Click(object sender, EventArgs e)
        {
            primerNumero = int.Parse(display.Text);
            display.Text = "";
            operador = "+";
        }

        private void boton_resta_Click(object sender, EventArgs e)
        {
            primerNumero = int.Parse(display.Text);
            display.Text = "";
            operador = "-";
        }

        private void boton_division_Click(object sender, EventArgs e)
        {
            primerNumero = int.Parse(display.Text);
            display.Text = "";
            operador = "/";
        }

        private void boton_multiplicacion_Click(object sender, EventArgs e)
        {
            primerNumero = int.Parse(display.Text);
            display.Text = "";
            operador = "*";
        }

        private void boton_potencia_Click(object sender, EventArgs e)
        {
            primerNumero = int.Parse(display.Text);
            display.Text = "";
            operador = "^";
        }

        private void boton_igual_Click(object sender, EventArgs e)
        {
            segundoNumero = int.Parse(display.Text);

            int sum;
            int mul;
            int pot;
            int res;

            switch (operador)
            {
                case "+":
                    sum = suma.Sumar(primerNumero,segundoNumero);
                    display.Text = sum.ToString();
                break;

                case "-":
                    res = resta.Restar(primerNumero, segundoNumero);
                    display.Text = res.ToString();
                break;

                case "*":
                    mul = multiplicacion.Multiplicar(primerNumero, segundoNumero);
                    display.Text = mul.ToString();
                break;

                case "^":
                    pot = potencia.Potenciar(primerNumero, segundoNumero);
                    display.Text = pot.ToString();
                break;

                case "/":
                    display.Text = division.Dividir(primerNumero, segundoNumero);
                break;
            }
        }

        private void display_TextChanged(object sender, EventArgs e)
        {

        }
    }
}