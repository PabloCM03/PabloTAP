using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraGUI.Clases
{
    internal class Division
    {

        public String Dividir (int n1, int n2)
        {
            if(n2 == 0)
            {
                return "No se puede dividir entre 0" ;
            }
            else
            {
                int d;
                d = n1 / n2;
                return d.ToString();
            }
        }
    }
}
