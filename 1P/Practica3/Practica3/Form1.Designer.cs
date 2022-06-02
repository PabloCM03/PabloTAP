namespace Practica3
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.Cargar = new System.Windows.Forms.Button();
            this.display = new System.Windows.Forms.TextBox();
            this.tiempo = new System.Windows.Forms.Button();
            this.tiempoCarga = new System.Windows.Forms.TextBox();
            this.directorios = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // Cargar
            // 
            this.Cargar.Location = new System.Drawing.Point(12, 12);
            this.Cargar.Name = "Cargar";
            this.Cargar.Size = new System.Drawing.Size(151, 44);
            this.Cargar.TabIndex = 0;
            this.Cargar.Text = "Cargar Documento";
            this.Cargar.UseVisualStyleBackColor = true;
            this.Cargar.Click += new System.EventHandler(this.Cargar_Click);
            // 
            // display
            // 
            this.display.Location = new System.Drawing.Point(12, 76);
            this.display.Multiline = true;
            this.display.Name = "display";
            this.display.Size = new System.Drawing.Size(1143, 584);
            this.display.TabIndex = 1;
            // 
            // tiempo
            // 
            this.tiempo.Location = new System.Drawing.Point(169, 12);
            this.tiempo.Name = "tiempo";
            this.tiempo.Size = new System.Drawing.Size(139, 44);
            this.tiempo.TabIndex = 2;
            this.tiempo.Text = "Tiempo de carga";
            this.tiempo.UseVisualStyleBackColor = true;
            this.tiempo.Click += new System.EventHandler(this.tiempo_Click);
            // 
            // tiempoCarga
            // 
            this.tiempoCarga.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tiempoCarga.Location = new System.Drawing.Point(453, 12);
            this.tiempoCarga.Multiline = true;
            this.tiempoCarga.Name = "tiempoCarga";
            this.tiempoCarga.Size = new System.Drawing.Size(702, 44);
            this.tiempoCarga.TabIndex = 3;
            // 
            // directorios
            // 
            this.directorios.Location = new System.Drawing.Point(314, 12);
            this.directorios.Name = "directorios";
            this.directorios.Size = new System.Drawing.Size(133, 44);
            this.directorios.TabIndex = 4;
            this.directorios.Text = "Directorios";
            this.directorios.UseVisualStyleBackColor = true;
            this.directorios.Click += new System.EventHandler(this.directorios_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1167, 672);
            this.Controls.Add(this.directorios);
            this.Controls.Add(this.tiempoCarga);
            this.Controls.Add(this.tiempo);
            this.Controls.Add(this.display);
            this.Controls.Add(this.Cargar);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Cargar;
        private System.Windows.Forms.TextBox display;
        private System.Windows.Forms.Button tiempo;
        private System.Windows.Forms.TextBox tiempoCarga;
        private System.Windows.Forms.Button directorios;
    }
}

