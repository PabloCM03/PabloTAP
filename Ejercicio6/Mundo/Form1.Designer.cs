namespace Mundo
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.Mundito = new System.Windows.Forms.PictureBox();
            this.tick = new System.Windows.Forms.Timer(this.components);
            this.comida = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.Mundito)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.comida)).BeginInit();
            this.SuspendLayout();
            // 
            // Mundito
            // 
            this.Mundito.Location = new System.Drawing.Point(30, 12);
            this.Mundito.Name = "Mundito";
            this.Mundito.Size = new System.Drawing.Size(100, 100);
            this.Mundito.TabIndex = 0;
            this.Mundito.TabStop = false;
            this.Mundito.Click += new System.EventHandler(this.Mundito_Click);
            this.Mundito.Paint += new System.Windows.Forms.PaintEventHandler(this.Mundito_Paint);
            // 
            // tick
            // 
            this.tick.Interval = 50;
            this.tick.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // comida
            // 
            this.comida.Location = new System.Drawing.Point(645, 139);
            this.comida.Name = "comida";
            this.comida.Size = new System.Drawing.Size(30, 30);
            this.comida.TabIndex = 1;
            this.comida.TabStop = false;
            this.comida.Paint += new System.Windows.Forms.PaintEventHandler(this.comida_Paint);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.comida);
            this.Controls.Add(this.Mundito);
            this.Name = "Form1";
            this.Text = "Form1";
            this.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.Form1_KeyPress);
            ((System.ComponentModel.ISupportInitialize)(this.Mundito)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.comida)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private PictureBox Mundito;
        private System.Windows.Forms.Timer tick;
        private PictureBox comida;
    }
}