using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace Practica5
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class formLogin : ContentPage
    {
        public formLogin()
        {
            InitializeComponent();
        }

        private async void validar_Usuario(object sender, EventArgs e)
        {

            if((String.IsNullOrWhiteSpace(cajaUsuario.Text) && String.IsNullOrWhiteSpace(cajaContraseña.Text))){

                await this.DisplayAlert("Advertencia", "No hay ningun dato", "OK");
            }
            else if(cajaUsuario.Text=="7267" && cajaContraseña.Text == "12345")
            {
                Navigation.PushAsync(new formLoginOk());
            }
            else
            {
                Navigation.PushAsync(new formLoginError());
            }
        }
    }
}