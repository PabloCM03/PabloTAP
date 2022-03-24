namespace Ejercicio2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (Application.MessageLoop == true)
            {
                Application.Exit();
            }
            else
            {
                Environment.Exit(1);
            }
        }

        public void mensaje()
        {
            MessageBox.Show("No hay mas opciones");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            mensaje();

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button10_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button11_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button12_Click(object sender, EventArgs e)
        {
            mensaje();
        }

        private void button13_Click(object sender, EventArgs e)
        {
            mensaje();
        }
    }
}