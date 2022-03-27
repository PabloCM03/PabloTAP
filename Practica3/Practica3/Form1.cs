using HtmlAgilityPack;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Sockets;
using System.Windows.Forms;
using HtmlDocument = HtmlAgilityPack.HtmlDocument;

namespace Practica3
{
    public partial class Form1 : Form
    {
        Documento.DocumentoPrincipal d = new Documento.DocumentoPrincipal();
        Directorio.Directorios directorio = new Directorio.Directorios();
        
        public Form1()
        {

            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Cargar_Click(object sender, EventArgs e)
        {

            HtmlWeb oweb = new HtmlWeb();
            HtmlDocument doc = oweb.Load("https://hdeleon.net/");

            display.Text = d.DocumentPrincipal(doc);
       

        }

        private void tiempo_Click(object sender, EventArgs e)
        {
            Stopwatch timeMeasure = new Stopwatch();
            timeMeasure.Start();

            HtmlWeb oweb = new HtmlWeb();
            HtmlDocument doc = oweb.Load("https://hdeleon.net/");

            display.Text = d.DocumentPrincipal(doc);
            timeMeasure.Stop();
            tiempoCarga.Text = "Tiempo de carga: " + timeMeasure.Elapsed.TotalSeconds + " Segundos";           

        }

        private void directorios_Click(object sender, EventArgs e)
        {
            HtmlWeb oweb = new HtmlWeb();
            HtmlDocument doc = oweb.Load("https://hdeleon.net/");

            display.Text = "";
            List<string> values;

            values = directorio.DirectoriosPagina(doc);

            for (int i= 0; i < values.Count; i++)
            {
                display.AppendText(values[i] +" \n");
            }
        }
    }
}
