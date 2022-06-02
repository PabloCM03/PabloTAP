using HtmlAgilityPack;
using System;

namespace Practica3.Documento
{
    public class DocumentoPrincipal
    {

        public String DocumentPrincipal(HtmlDocument doc)
        {

            HtmlNode Body = doc.DocumentNode;
            string sBody = Body.InnerHtml;


            return sBody;

        }
    }
}
