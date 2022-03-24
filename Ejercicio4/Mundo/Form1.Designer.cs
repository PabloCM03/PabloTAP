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
            this.Mundito = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.Mundito)).BeginInit();
            this.SuspendLayout();
            // 
            // Mundito
            // 
            this.Mundito.Location = new System.Drawing.Point(7, 9);
            this.Mundito.Name = "Mundito";
            this.Mundito.Size = new System.Drawing.Size(781, 429);
            this.Mundito.TabIndex = 0;
            this.Mundito.TabStop = false;
            this.Mundito.Click += new System.EventHandler(this.Mundito_Click);
            this.Mundito.Paint += new System.Windows.Forms.PaintEventHandler(this.Mundito_Paint);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.Mundito);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.Mundito)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private PictureBox Mundito;
    }
}