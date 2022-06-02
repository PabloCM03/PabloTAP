using System;
using System.Collections.Generic;
using System.ComponentModel;
using Ejercicio6.Interface;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Ejercicio6
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private async void btn_guardar_Clicked(object sender, EventArgs e)
        {

            if (String.IsNullOrWhiteSpace(txt_entrada.Text))
            {
                await DisplayAlert("Alerta", "No puedes guardar notas vacias", "OK");
            }
            else
            {
                var contenido = txt_entrada.Text;

                DependencyService.Get<ServicioArchivo>().CrearArchivo(contenido);

                await DisplayAlert("Alerta", "Guardado correctamente", "OK");
                txt_entrada.Text = "";

            }
        }

        private void btn_borrar_Clicked(object sender, EventArgs e)
        {

            DependencyService.Get<ServicioArchivo>().BorrarArchivo();
          
        }
    }
}
