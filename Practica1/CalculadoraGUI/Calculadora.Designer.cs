namespace CalculadoraGUI
{
    partial class Calculadora
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
            this.display = new System.Windows.Forms.TextBox();
            this.boton_1 = new System.Windows.Forms.Button();
            this.boton_2 = new System.Windows.Forms.Button();
            this.boton_3 = new System.Windows.Forms.Button();
            this.boton_suma = new System.Windows.Forms.Button();
            this.boton_4 = new System.Windows.Forms.Button();
            this.boton_5 = new System.Windows.Forms.Button();
            this.boton_6 = new System.Windows.Forms.Button();
            this.boton_resta = new System.Windows.Forms.Button();
            this.boton_7 = new System.Windows.Forms.Button();
            this.boton_8 = new System.Windows.Forms.Button();
            this.boton_9 = new System.Windows.Forms.Button();
            this.boton_division = new System.Windows.Forms.Button();
            this.boton_multiplicacion = new System.Windows.Forms.Button();
            this.boton_0 = new System.Windows.Forms.Button();
            this.boton_potencia = new System.Windows.Forms.Button();
            this.boton_igual = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // display
            // 
            this.display.BackColor = System.Drawing.SystemColors.HighlightText;
            this.display.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.display.ForeColor = System.Drawing.SystemColors.GrayText;
            this.display.Location = new System.Drawing.Point(5, 13);
            this.display.Multiline = true;
            this.display.Name = "display";
            this.display.ReadOnly = true;
            this.display.Size = new System.Drawing.Size(465, 35);
            this.display.TabIndex = 0;
            this.display.Text = "1234567890";
            this.display.TextChanged += new System.EventHandler(this.display_TextChanged);
            // 
            // boton_1
            // 
            this.boton_1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_1.Location = new System.Drawing.Point(5, 91);
            this.boton_1.Name = "boton_1";
            this.boton_1.Size = new System.Drawing.Size(111, 58);
            this.boton_1.TabIndex = 1;
            this.boton_1.Text = "1";
            this.boton_1.UseVisualStyleBackColor = true;
            this.boton_1.Click += new System.EventHandler(this.boton_1_Click);
            // 
            // boton_2
            // 
            this.boton_2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_2.Location = new System.Drawing.Point(125, 91);
            this.boton_2.Name = "boton_2";
            this.boton_2.Size = new System.Drawing.Size(111, 58);
            this.boton_2.TabIndex = 2;
            this.boton_2.Text = "2";
            this.boton_2.UseVisualStyleBackColor = true;
            this.boton_2.Click += new System.EventHandler(this.boton_2_Click);
            // 
            // boton_3
            // 
            this.boton_3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_3.Location = new System.Drawing.Point(242, 91);
            this.boton_3.Name = "boton_3";
            this.boton_3.Size = new System.Drawing.Size(111, 58);
            this.boton_3.TabIndex = 3;
            this.boton_3.Text = "3";
            this.boton_3.UseVisualStyleBackColor = true;
            this.boton_3.Click += new System.EventHandler(this.boton_3_Click);
            // 
            // boton_suma
            // 
            this.boton_suma.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_suma.Location = new System.Drawing.Point(359, 91);
            this.boton_suma.Name = "boton_suma";
            this.boton_suma.Size = new System.Drawing.Size(111, 58);
            this.boton_suma.TabIndex = 4;
            this.boton_suma.Text = "+";
            this.boton_suma.UseVisualStyleBackColor = true;
            this.boton_suma.Click += new System.EventHandler(this.boton_suma_Click);
            // 
            // boton_4
            // 
            this.boton_4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_4.Location = new System.Drawing.Point(5, 155);
            this.boton_4.Name = "boton_4";
            this.boton_4.Size = new System.Drawing.Size(111, 58);
            this.boton_4.TabIndex = 5;
            this.boton_4.Text = "4";
            this.boton_4.UseVisualStyleBackColor = true;
            this.boton_4.Click += new System.EventHandler(this.boton_4_Click);
            // 
            // boton_5
            // 
            this.boton_5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_5.Location = new System.Drawing.Point(125, 155);
            this.boton_5.Name = "boton_5";
            this.boton_5.Size = new System.Drawing.Size(111, 58);
            this.boton_5.TabIndex = 6;
            this.boton_5.Text = "5";
            this.boton_5.UseVisualStyleBackColor = true;
            this.boton_5.Click += new System.EventHandler(this.boton_5_Click);
            // 
            // boton_6
            // 
            this.boton_6.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_6.Location = new System.Drawing.Point(242, 155);
            this.boton_6.Name = "boton_6";
            this.boton_6.Size = new System.Drawing.Size(111, 58);
            this.boton_6.TabIndex = 7;
            this.boton_6.Text = "6";
            this.boton_6.UseVisualStyleBackColor = true;
            this.boton_6.Click += new System.EventHandler(this.boton_6_Click);
            // 
            // boton_resta
            // 
            this.boton_resta.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_resta.Location = new System.Drawing.Point(359, 155);
            this.boton_resta.Name = "boton_resta";
            this.boton_resta.Size = new System.Drawing.Size(111, 58);
            this.boton_resta.TabIndex = 8;
            this.boton_resta.Text = "-";
            this.boton_resta.UseVisualStyleBackColor = true;
            this.boton_resta.Click += new System.EventHandler(this.boton_resta_Click);
            // 
            // boton_7
            // 
            this.boton_7.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_7.Location = new System.Drawing.Point(5, 219);
            this.boton_7.Name = "boton_7";
            this.boton_7.Size = new System.Drawing.Size(111, 58);
            this.boton_7.TabIndex = 9;
            this.boton_7.Text = "7";
            this.boton_7.UseVisualStyleBackColor = true;
            this.boton_7.Click += new System.EventHandler(this.boton_7_Click);
            // 
            // boton_8
            // 
            this.boton_8.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_8.Location = new System.Drawing.Point(125, 219);
            this.boton_8.Name = "boton_8";
            this.boton_8.Size = new System.Drawing.Size(111, 58);
            this.boton_8.TabIndex = 10;
            this.boton_8.Text = "8";
            this.boton_8.UseVisualStyleBackColor = true;
            this.boton_8.Click += new System.EventHandler(this.boton_8_Click);
            // 
            // boton_9
            // 
            this.boton_9.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_9.Location = new System.Drawing.Point(242, 219);
            this.boton_9.Name = "boton_9";
            this.boton_9.Size = new System.Drawing.Size(111, 58);
            this.boton_9.TabIndex = 11;
            this.boton_9.Text = "9";
            this.boton_9.UseVisualStyleBackColor = true;
            this.boton_9.Click += new System.EventHandler(this.boton_9_Click);
            // 
            // boton_division
            // 
            this.boton_division.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_division.Location = new System.Drawing.Point(359, 219);
            this.boton_division.Name = "boton_division";
            this.boton_division.Size = new System.Drawing.Size(111, 58);
            this.boton_division.TabIndex = 12;
            this.boton_division.Text = "/";
            this.boton_division.UseVisualStyleBackColor = true;
            this.boton_division.Click += new System.EventHandler(this.boton_division_Click);
            // 
            // boton_multiplicacion
            // 
            this.boton_multiplicacion.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_multiplicacion.Location = new System.Drawing.Point(5, 283);
            this.boton_multiplicacion.Name = "boton_multiplicacion";
            this.boton_multiplicacion.Size = new System.Drawing.Size(111, 58);
            this.boton_multiplicacion.TabIndex = 13;
            this.boton_multiplicacion.Text = "*";
            this.boton_multiplicacion.UseVisualStyleBackColor = true;
            this.boton_multiplicacion.Click += new System.EventHandler(this.boton_multiplicacion_Click);
            // 
            // boton_0
            // 
            this.boton_0.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_0.Location = new System.Drawing.Point(125, 283);
            this.boton_0.Name = "boton_0";
            this.boton_0.Size = new System.Drawing.Size(111, 58);
            this.boton_0.TabIndex = 14;
            this.boton_0.Text = "0";
            this.boton_0.UseVisualStyleBackColor = true;
            this.boton_0.Click += new System.EventHandler(this.boton_0_Click);
            // 
            // boton_potencia
            // 
            this.boton_potencia.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_potencia.Location = new System.Drawing.Point(242, 283);
            this.boton_potencia.Name = "boton_potencia";
            this.boton_potencia.Size = new System.Drawing.Size(111, 58);
            this.boton_potencia.TabIndex = 15;
            this.boton_potencia.Text = "^";
            this.boton_potencia.UseVisualStyleBackColor = true;
            this.boton_potencia.Click += new System.EventHandler(this.boton_potencia_Click);
            // 
            // boton_igual
            // 
            this.boton_igual.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.boton_igual.Location = new System.Drawing.Point(359, 283);
            this.boton_igual.Name = "boton_igual";
            this.boton_igual.Size = new System.Drawing.Size(111, 58);
            this.boton_igual.TabIndex = 16;
            this.boton_igual.Text = "=";
            this.boton_igual.UseVisualStyleBackColor = true;
            this.boton_igual.Click += new System.EventHandler(this.boton_igual_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(31, 63);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(38, 25);
            this.label1.TabIndex = 17;
            this.label1.Text = "C1";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(159, 63);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(38, 25);
            this.label2.TabIndex = 18;
            this.label2.Text = "C2";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(278, 63);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(38, 25);
            this.label3.TabIndex = 19;
            this.label3.Text = "C3";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(394, 63);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(39, 25);
            this.label4.TabIndex = 20;
            this.label4.Text = "Op";
            this.label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // Calculadora
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(482, 353);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.boton_igual);
            this.Controls.Add(this.boton_potencia);
            this.Controls.Add(this.boton_0);
            this.Controls.Add(this.boton_multiplicacion);
            this.Controls.Add(this.boton_division);
            this.Controls.Add(this.boton_9);
            this.Controls.Add(this.boton_8);
            this.Controls.Add(this.boton_7);
            this.Controls.Add(this.boton_resta);
            this.Controls.Add(this.boton_6);
            this.Controls.Add(this.boton_5);
            this.Controls.Add(this.boton_4);
            this.Controls.Add(this.boton_suma);
            this.Controls.Add(this.boton_3);
            this.Controls.Add(this.boton_2);
            this.Controls.Add(this.boton_1);
            this.Controls.Add(this.display);
            this.Name = "Calculadora";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Calculadora simple";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox display;
        private System.Windows.Forms.Button boton_1;
        private System.Windows.Forms.Button boton_2;
        private System.Windows.Forms.Button boton_3;
        private System.Windows.Forms.Button boton_suma;
        private System.Windows.Forms.Button boton_4;
        private System.Windows.Forms.Button boton_5;
        private System.Windows.Forms.Button boton_6;
        private System.Windows.Forms.Button boton_resta;
        private System.Windows.Forms.Button boton_7;
        private System.Windows.Forms.Button boton_8;
        private System.Windows.Forms.Button boton_9;
        private System.Windows.Forms.Button boton_division;
        private System.Windows.Forms.Button boton_multiplicacion;
        private System.Windows.Forms.Button boton_0;
        private System.Windows.Forms.Button boton_potencia;
        private System.Windows.Forms.Button boton_igual;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
    }
}

