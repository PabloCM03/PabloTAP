using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraGUI.Clases
{
    internal class Potencia
    {
        public int Potenciar(int n1, int n2)
        {
            int p;
            double bas = n1;
            double elevado = n2;

            p = (int) Math.Pow(bas,elevado);

            return p;
        }
    }
}
