namespace Mundo
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {

            int x = Mundito.Location.X;
            int y = Mundito.Location.Y;
            int x2 = comida.Location.X;
            int y2 = comida.Location.Y;

            if (e.KeyChar == 'a')
            {
                x -= 8;
                
            }

            if (e.KeyChar == 'd')
            {
                x += 8;
            }

            if (e.KeyChar == 'w')
            {
                y -= 8;
            }

            if (e.KeyChar == 's')
            {
                y += 8;
            }
            Point punto = new Point(x, y);
            Mundito.Location = punto;

            if ((comida.Location.X >= Mundito.Location.X) && ((comida.Location.X + 50) <= 
                (Mundito.Location.X + 100)) && (comida.Location.Y >= Mundito.Location.Y) &&
                ((comida.Location.Y + 50) <= (Mundito.Location.Y + 100)))
            {

                Random x1r = new Random();                
                Random y1r = new Random();
                

                x2 = x1r.Next(1, 800);
                y2 = y1r.Next(1, 485);
                Point punto2 = new Point(x2, y2);
                comida.Location = punto2;
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {

            Mundito.Invalidate();
        }

        private void Mundito_Paint(object sender, PaintEventArgs e)
        {
             Graphics lienzo = e.Graphics;

            SolidBrush brush = new SolidBrush(Color.Yellow);
            lienzo.FillEllipse(brush, 0,0,100,100);


        }


        private void comida_Paint(object sender, PaintEventArgs e)
        {
            Graphics lienzo = e.Graphics;

            SolidBrush brush = new SolidBrush(Color.Blue);
            lienzo.FillEllipse(brush, 0, 0, 30, 30);
        }

        private void Mundito_Click(object sender, EventArgs e)
        {

        }

    }
}