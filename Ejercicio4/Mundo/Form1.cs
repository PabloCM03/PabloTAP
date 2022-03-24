namespace Mundo
{
    public partial class Form1 : Form
    {


        int x, y;
        int w, h;

        public Form1()
        {
            InitializeComponent();
            x = 20;
            y = 28;
            w = h = 100;
        }

        private void Mundito_Paint(object sender, PaintEventArgs e)
        {
             Graphics lienzo = e.Graphics;

            Font drawFont = new Font("Arial", 10);

            //Dibujar el rombo
            Pen pen = new Pen(Color.Black);
            lienzo.DrawRectangle(pen, x, y, w, h);
            SolidBrush brush = new SolidBrush(Color.Black);
            lienzo.FillEllipse(brush, x,y,w,h);
            brush.Color = Color.White;
            lienzo.DrawString("Hola :v", drawFont,brush,  x, (y+h/2));

        }

        private void Mundito_Click(object sender, EventArgs e)
        {

        }
    }
}