using System;
using System.Collections.Generic;
using System.Text;

namespace Ejercicio6.Interface
{
    public interface ServicioArchivo
    {
        bool CrearArchivo(string contenido);
        bool BorrarArchivo();
    }
}