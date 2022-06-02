namespace CanvasCsharp
{

    public partial class Form1 : Form
    {
        Image uno = null;
        int x, y;
        int fx, fy;
        int img = 0;
        double velocidad = 0.1;
        int tiempo = 200;
        int fila = 0;

        public Form1()
        {
            InitializeComponent();
            uno = Image.FromFile("C:/Users/Pablo Che/source/repos/CanvasCsharp/CanvasCsharp/src/tortuga.png");
            x = y = 0;
            fx = fy = 0;
            tick.Enabled = true;
            tick.Start();
        }

        private void tick_Tick(object sender, EventArgs e)
        {
            img++;
            if (img > 3) img =  0;
            CollisionCheck();
            lienzo.Invalidate();

        }

        private void CollisionCheck()
        {
            
        }

        private void Form1_KeyPress(object sender, KeyPressEventArgs e)
        {
            int distancia = (int)(velocidad * tiempo);
            if(e.KeyChar == 'a')
            {
                x -= distancia;
                //fila = 1;
            }

            if (e.KeyChar == 'd')
            {
                x += distancia;
                //fila = 1;
            }
        }

        private void lienzo_Paint(object sender, PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.DrawImage(uno, new Rectangle(x,y,350,200),
                fx + img*350, fy + fila*350, 450, 450, GraphicsUnit.Pixel);
        }

        private void lienzo_Click(object sender, EventArgs e)
        {

        }
    }
}