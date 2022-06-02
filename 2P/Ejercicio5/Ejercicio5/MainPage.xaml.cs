using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Ejercicio5
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        int contadorsuma;

        private void funcion_btn(object sender, EventArgs e)
        {

                contadorsuma++;
                contadorVista.Text = contadorsuma.ToString() + " veces";       

        }
    }
}
