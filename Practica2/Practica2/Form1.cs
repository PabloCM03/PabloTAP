namespace Practica2
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
            this.Controls.OfType<Control>().Where(ctr=>ctr is Label).ToList().ForEach(ctr =>
            {

                ctr.MouseDown += Ctr_MouseDown;
                ctr.MouseUp += Ctr_MouseUp;
                ctr.MouseMove += Ctr_MouseMove;

            });
        }

        bool down = false;
        Point inicial;

        private void Ctr_MouseMove(object? sender, MouseEventArgs e)
        {
            Control ctr = (Control)sender;
            if (down)
            {

                ctr.Left = e.X + ctr.Left - inicial.X;
                ctr.Top = e.Y + ctr.Top - inicial.Y;

            }
        }

        private void Ctr_MouseUp(object? sender, MouseEventArgs e) => down = false;

        private void Ctr_MouseDown(object? sender, MouseEventArgs e)
        {
            if(e.Button == MouseButtons.Left)
            {
                down = true;
                inicial= e.Location;
            }
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void lienzoPaint(object sender, PaintEventArgs e)
        { 

            Graphics lienzo = e.Graphics;

            //Dibujar el rombo
            Pen pen = new Pen(Color.Black);
            lienzo.DrawLine(pen, 600, 400, 700, 300);
            lienzo.DrawLine(pen, 600, 400, 700, 500);
            lienzo.DrawLine(pen, 800, 400, 700, 300);
            lienzo.DrawLine(pen, 800, 400, 700, 500);

            //Dibujar el Rectangulo
            SolidBrush pinkBrush = new SolidBrush(Color.Yellow);
            Rectangle rectan = new Rectangle(100, 200, 300, 300);
            lienzo.FillRectangle(pinkBrush, rectan);


        }

        private void button1_MouseClick(object sender, MouseEventArgs e)
        {
            

        }

        private void button1_MouseDown(object sender, MouseEventArgs e)
        {
            
        }

        private void botonRedondo1_Click(object sender, EventArgs e)
        {
            botonRedondo1.BackColor = Color.Orange;

            p1.SetBounds(699, 374, 49, 20);
            p2.SetBounds(652, 411, 53, 20);
            p3.SetBounds(732, 411, 45, 20);
            p4.SetBounds(699, 444, 49, 20);
        }

        private void botonRedondo1_MouseDown(object sender, MouseEventArgs e)
        {
            botonRedondo1.BackColor = Color.Green;
        }

        private void botonRedondo1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == 'r')
            {

                p1.SetBounds(699, 374, 49, 20);
                p2.SetBounds(652, 411, 53, 20);
                p3.SetBounds(732, 411, 45, 20);
                p4.SetBounds(699, 444, 49, 20);
            }
        }

        private void botonRedondo1_KeyDown(object sender, KeyEventArgs e)
        {
           
        }
    }
}