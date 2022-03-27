using HtmlAgilityPack;
using ScrapySharp.Extensions;
using System;
using System.Collections.Generic;
using System.Linq;
using HtmlDocument = HtmlAgilityPack.HtmlDocument;

namespace Practica3.Directorio
{
    public class Directorios
    {
        public List<string> DirectoriosPagina(HtmlDocument doc)
        {
            List<string> Mistitulos = new List<string>();

            foreach (var Nodo in doc.DocumentNode.CssSelect(".entry-title"))
            {
                var NodoAnchor = Nodo.CssSelect("a").First();
                Mistitulos.Add(NodoAnchor.InnerHtml);
            }


            return Mistitulos;

        }

    }
}
