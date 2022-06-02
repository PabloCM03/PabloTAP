namespace Practica2
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
            this.canva = new System.Windows.Forms.PictureBox();
            this.p2 = new System.Windows.Forms.Label();
            this.p1 = new System.Windows.Forms.Label();
            this.p4 = new System.Windows.Forms.Label();
            this.p3 = new System.Windows.Forms.Label();
            this.botonRedondo1 = new Practica2.BotonRedondo();
            ((System.ComponentModel.ISupportInitialize)(this.canva)).BeginInit();
            this.SuspendLayout();
            // 
            // canva
            // 
            this.canva.Location = new System.Drawing.Point(12, 12);
            this.canva.Name = "canva";
            this.canva.Size = new System.Drawing.Size(935, 566);
            this.canva.TabIndex = 0;
            this.canva.TabStop = false;
            this.canva.Paint += new System.Windows.Forms.PaintEventHandler(this.lienzoPaint);
            // 
            // p2
            // 
            this.p2.AutoSize = true;
            this.p2.Image = global::Practica2.Properties.Resources.seta;
            this.p2.Location = new System.Drawing.Point(652, 411);
            this.p2.Name = "p2";
            this.p2.Size = new System.Drawing.Size(53, 20);
            this.p2.TabIndex = 2;
            this.p2.Text = "           ";
            // 
            // p1
            // 
            this.p1.AutoSize = true;
            this.p1.Image = global::Practica2.Properties.Resources.monedas;
            this.p1.Location = new System.Drawing.Point(699, 374);
            this.p1.Name = "p1";
            this.p1.Size = new System.Drawing.Size(49, 20);
            this.p1.TabIndex = 3;
            this.p1.Text = "          ";
            // 
            // p4
            // 
            this.p4.AutoSize = true;
            this.p4.Image = global::Practica2.Properties.Resources.super_mario;
            this.p4.Location = new System.Drawing.Point(699, 444);
            this.p4.Name = "p4";
            this.p4.Size = new System.Drawing.Size(49, 20);
            this.p4.TabIndex = 4;
            this.p4.Text = "          ";
            // 
            // p3
            // 
            this.p3.AutoSize = true;
            this.p3.Image = global::Practica2.Properties.Resources.planta_carnivora;
            this.p3.Location = new System.Drawing.Point(732, 411);
            this.p3.Name = "p3";
            this.p3.Size = new System.Drawing.Size(45, 20);
            this.p3.TabIndex = 5;
            this.p3.Text = "         ";
            // 
            // botonRedondo1
            // 
            this.botonRedondo1.BackColor = System.Drawing.Color.Lime;
            this.botonRedondo1.Location = new System.Drawing.Point(420, 33);
            this.botonRedondo1.Name = "botonRedondo1";
            this.botonRedondo1.Size = new System.Drawing.Size(131, 126);
            this.botonRedondo1.TabIndex = 6;
            this.botonRedondo1.Text = "Reiniciar";
            this.botonRedondo1.UseVisualStyleBackColor = false;
            this.botonRedondo1.Click += new System.EventHandler(this.botonRedondo1_Click);
            this.botonRedondo1.KeyDown += new System.Windows.Forms.KeyEventHandler(this.botonRedondo1_KeyDown);
            this.botonRedondo1.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.botonRedondo1_KeyPress);
            this.botonRedondo1.MouseDown += new System.Windows.Forms.MouseEventHandler(this.botonRedondo1_MouseDown);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(959, 590);
            this.Controls.Add(this.botonRedondo1);
            this.Controls.Add(this.p3);
            this.Controls.Add(this.p4);
            this.Controls.Add(this.p1);
            this.Controls.Add(this.p2);
            this.Controls.Add(this.canva);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.canva)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private PictureBox canva;
        private Label p2;
        private Label p1;
        private Label p4;
        private Label p3;
        private BotonRedondo botonRedondo1;
    }
}