using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practica4.Enemigo
{
    public class LogicaEnemigo
    {

        Random rand = new Random();
        Random rand2 = new Random();
        List<int> posiciones = new List<int>();
        
        public List<int> posicionBarcosEnemigo(int valorTamaño)
        {

            for (int i = 0; i < 5; i++)
            {
                int index = rand.Next(valorTamaño);
                
                if (!posiciones.Contains(index) || !(index < 1))
                {
                    posiciones.Add(index);
        
                }
                else
                {
                    index = rand.Next(valorTamaño);
                }
            }
          
            return posiciones;
        }


        public int eleccionEnemigo(int tamaño)
        {
            int aleatorio = rand2.Next(tamaño);
            int eleccion=0;

                if(!(aleatorio < 1))
                {
                    eleccion = aleatorio;
                }
                else
                {
                    aleatorio = rand2.Next(tamaño);
                }
            return eleccion;
        }
    }
}
