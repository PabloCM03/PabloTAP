namespace Mundo
{
    public partial class Form1 : Form
    {

        int x, y, w, h;
        int fx, fy;
        int img = 0;
        double velocidad = 0.1;
        int tiempo = 200;

        public Form1()
        {
            InitializeComponent();
            w = h = 100;
            x = y = 0;
            fx = fy = 0;
            tick.Enabled = true;
            tick.Start();
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {

            if (e.KeyChar == 'a')
            {
                x -= 8;
                
            }

            if (e.KeyChar == 'd')
            {
                x +=  8;
            }

            if (e.KeyChar == 'w')
            {
                y -= 8;
            }

            if (e.KeyChar == 's')
            {
                y += 8;
            }

        }

        private void timer1_Tick(object sender, EventArgs e)
        {

            Mundito.Invalidate();
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