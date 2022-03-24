using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicio1
{
    public partial class Form1 : Form
    {
        double total;

        public Form1()
        {
            InitializeComponent();
            total = 0;
        }

        private void aceptar_click(object sender, EventArgs e)
        {
            double temporal;

            var r = Double.TryParse(textBox2.Text.Trim(), out temporal);
            if (r)
            {
                textBox2.Text = "";
                total += temporal;

            } else
            {
                MessageBox.Show("Deber ser un valor numerico");
            }
        }
        private void igual_click(object sender, EventArgs e)
        {
            textBox1.Text = "Resultado: "+ total.ToString();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            TextBox txt = (TextBox)sender;

            if (txt.Text.Length <= 0) return;
            bool isRight = Double.TryParse(txt.Text,out _);

            if (!isRight)
            {
                MessageBox.Show("Dato no valido");
                string res = "";
                for (int i = 0; i < txt.Text.Length; i++)
                {
                    switch(txt.Text[i])
                    {
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':

                            res += txt.Text[i];
                            break;
                    }
                }
                txt.Text = res;
            }
        }

        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            e.Handled = false;
        }
    }
}