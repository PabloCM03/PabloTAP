using HtmlAgilityPack;
using System;
using System.Diagnostics;
using HtmlDocument = HtmlAgilityPack.HtmlDocument;


namespace Practica3.Tiempo
{

    public class Tiempo
    {

        Documento.DocumentoPrincipal d = new Documento.DocumentoPrincipal();

        public String TiempoCarga(HtmlDocument doc)
        {
            Stopwatch timeMeasure = new Stopwatch();
            timeMeasure.Start();

            d.DocumentPrincipal(doc);

            timeMeasure.Stop();
            return ""+timeMeasure.Elapsed.TotalSeconds;

        }
    }
}