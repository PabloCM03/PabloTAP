using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Practica4.Enemigo;

namespace Practica4
{
    public partial class Battleship : Form
    {

        //Lista para almancenar
        List<Button> botonesPosicionJugador;
        List<Button> botonesPosicionEnemigo;
        List<int> RandomPosicionBarcos = new List<int>();

        //Usar paquete de la logica del enemigo
        LogicaEnemigo logicEnem = new LogicaEnemigo();


        //Valores que se usaran dentro de la ejecuacion
        int totalBarcos = 5;
        int rondas = 10;
        int puntosDeJugador;
        int puntoDeEnemigo;

        public Battleship()
        {
            InitializeComponent();
            ReiniciarJuego();
        }

        //Iniciar el juego
        public void ReiniciarJuego()
        {

            botonesPosicionJugador = new List<Button> {A1,A2,A3,A4,A5,B1,B2,B3,B4,B5,C1,C2,
                C3,C4,C5,D1,D2,D3,D4,D5,E1,E2,E3,E4,E5 };

            botonesPosicionEnemigo = new List<Button> {F6,F7,F8,F9,F10,G6,G7,G8,G9,G10,H6,
                H7,H8,H9,H10,I6,I7,I8,I9,I10,J6,J7,J8,J9,J10};


            posicionEnemigoBox.Items.Clear();
            posicionEnemigoBox.Text = null;

            for (int i = 0; i < botonesPosicionEnemigo.Count; i++)
            {
                botonesPosicionEnemigo[i].Enabled = true;
                botonesPosicionEnemigo[i].Tag = null;
                botonesPosicionEnemigo[i].BackColor = Color.White;
                botonesPosicionEnemigo[i].BackgroundImage = null;
                posicionEnemigoBox.Items.Add(botonesPosicionEnemigo[i].Text);
                
            }

            for (int i = 0; i < botonesPosicionJugador.Count; i++)
            {
                botonesPosicionJugador[i].Enabled = true;
                botonesPosicionJugador[i].Tag = null;
                botonesPosicionJugador[i].BackColor = Color.White;
                botonesPosicionJugador[i].BackgroundImage = null;
            }

            puntosDeJugador = 0;
            puntoDeEnemigo = 0;
            rondas = 10;
            totalBarcos = 5;

            txtpuntoJugador.Text = puntosDeJugador.ToString();
            txtpuntoEnemigo.Text = puntoDeEnemigo.ToString();
            txtmovEnemigo.Text = "";

            btnAtacar.Enabled = false;

            RandomPosicionBarcos = logicEnem.posicionBarcosEnemigo(botonesPosicionEnemigo.Count);

            for (int i = 0; i < 5; i++)
            {

                int r = RandomPosicionBarcos[i];

                botonesPosicionEnemigo[r].Tag = "barcoEnemigo";
                Debug.WriteLine("Posicion de barcos Enemigos: " + botonesPosicionEnemigo[r].Text);

            }
        }


        //Evento para elegir las posiciones de los barcos dentro del tablero
        private void PosicionBarcosJugadorEvent(object sender, EventArgs e)
        {
            if (totalBarcos > 0)
            {
                var button = (Button)sender;

                button.Enabled = false;
                button.Tag = "barcoJugador";
                button.BackColor = Color.Orange;
                totalBarcos -= 1;
            }

            if (totalBarcos == 0)
            {
                btnAtacar.Enabled = true;
                btnAtacar.BackColor = Color.Red;
                btnAtacar.ForeColor = Color.White;

            }
        }

        //Boton para atacar al enemigo en la posicion elegida 
        private void AtacarEvent(object sender, EventArgs e)
        {

            if (posicionEnemigoBox.Text != "")
            {

                var attackPosition = posicionEnemigoBox.Text.ToString();

                int index = botonesPosicionEnemigo.FindIndex(F => F.Name == attackPosition);
                if (botonesPosicionEnemigo[index].Enabled && rondas > 0)
                {
                    rondas -= 1;
                    txtRondas.Text = "Rondas: " + rondas;


                    if ((string)botonesPosicionEnemigo[index].Tag == "barcoEnemigo")
                    {

                        botonesPosicionEnemigo[index].Enabled = false;
                        botonesPosicionEnemigo[index].BackgroundImage = Properties.Resources.fire;
                        botonesPosicionEnemigo[index].BackColor = Color.Blue;
                        botonesPosicionEnemigo[index].ForeColor = Color.White;
                        puntosDeJugador += 1;
                        txtpuntoJugador.Text = puntosDeJugador.ToString();
                        EnemigoJuegoTimer.Start();

                    }
                    else
                    {
                        botonesPosicionEnemigo[index].Enabled = false;
                        botonesPosicionEnemigo[index].BackColor = Color.Blue;
                        botonesPosicionEnemigo[index].ForeColor = Color.White;
                        EnemigoJuegoTimer.Start();
                    }
                }
            }
            else
            {
                MessageBox.Show("Selecciona una posicion a atacar", "Advertencia");
            }
        }

        //Timer para esperar al enemigo
        private void EnemigoPlayEventTimer(object sender, EventArgs e)
        {

            if (botonesPosicionJugador.Count > 0 && rondas > 0)
            {
                rondas -= 1;

                txtRondas.Text = "Rondas: " + rondas;

                int elecciAtacar;
                elecciAtacar = logicEnem.eleccionEnemigo(botonesPosicionJugador.Count);

                if ((string)botonesPosicionJugador[elecciAtacar].Tag == "barcoJugador")
                {
                    botonesPosicionJugador[elecciAtacar].BackgroundImage = Properties.Resources.fire;
                    txtmovEnemigo.Text = botonesPosicionJugador[elecciAtacar].Text;
                    botonesPosicionJugador[elecciAtacar].Enabled = false;
                    botonesPosicionJugador[elecciAtacar].ForeColor = Color.White;
                    botonesPosicionJugador[elecciAtacar].BackColor = Color.Blue;
                    botonesPosicionJugador.RemoveAt(elecciAtacar);
                    puntoDeEnemigo += 1;
                    txtpuntoEnemigo.Text = puntoDeEnemigo.ToString();
                    EnemigoJuegoTimer.Stop();
                }
                else
                {
                    botonesPosicionJugador[elecciAtacar].BackColor=Color.Blue;
                    txtmovEnemigo.Text = botonesPosicionJugador[elecciAtacar].Text;
                    botonesPosicionJugador[elecciAtacar].Enabled = false;
                    botonesPosicionJugador[elecciAtacar].ForeColor = Color.White;
                    botonesPosicionJugador.RemoveAt(elecciAtacar);
                    EnemigoJuegoTimer.Stop();
                }
            }

            if (rondas < 1 || puntoDeEnemigo > 2 || puntosDeJugador > 2)
            {

                if (puntosDeJugador > puntoDeEnemigo)
                {
                    MessageBox.Show("Tu eres el ganador¡¡", "Felicidades");
                    ReiniciarJuego();
                }
                else if (puntoDeEnemigo > puntosDeJugador)
                {
                    MessageBox.Show("JAJAJAJA, perdiste el juego", "Sigue practicando");
                    ReiniciarJuego();
                }
                else if (puntoDeEnemigo == puntosDeJugador)
                {
                    MessageBox.Show("Quedaron empatados, repitan el juego", "¡Oh no!");
                    ReiniciarJuego();
                }
            }
        }
    }
}
