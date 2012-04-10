//Criando Projeto App MinhaLista - IFPI - hilfranjr.wordpress.com



package com.wordpress.hilfranjr;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends Activity {

	Button btAdicionarProduto, btConsultar, btMenuPrincipal, btVoltar;
	Registro objRegistro;
	EditText ednome, edpreco;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        chamaMenuPrincipal();
       
        btAdicionarProduto = (Button) findViewById(R.id.btAdicionarProduto);
        btConsultar = (Button) findViewById(R.id.btConsultar);

        
        btAdicionarProduto.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				chamaCadastro();	  //Chama a tela de cadastro 
				
			}
		});
        
        
        btConsultar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				chamaConsulta();	  //Chama a tela de consulta 
				
			}
		}); 
        
       
       
        
        
        
    }    

    public void chamaCadastro(){
    	setContentView(R.layout.cadastroproduto);
    	Button btMenuPrincipal = (Button) findViewById(R.id.btMenuPrincipal);
    	Button btgravar = (Button) findViewById(R.id.btgravar);

        btMenuPrincipal.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {

 				chamaMenuPrincipal();	  //Chama a tela de consulta 
 				
 			}
 		}); 
        
        
        btgravar.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {

 				objRegistro = new Registro();
 				ednome = (EditText) findViewById(R.id.ednome);
 				edpreco = (EditText) findViewById(R.id.edpreco);
 				
 				//gravar 
 				
 				objRegistro.nome = ednome.getText().toString();
 				objRegistro.preco = edpreco.getText().toString();
 				

 				
 			}
 		}); 
    }
       
    public void chamaConsulta(){
    	setContentView(R.layout.consultarproduto);
        Button btVoltar = (Button) findViewById(R.id.btVoltar);
 
        TextView tvnome = (TextView) findViewById(R.id.tvnome);
        TextView tvpreco = (TextView) findViewById(R.id.tvpreco);
        
        
        tvnome.setText(objRegistro.nome);
        tvpreco.setText(objRegistro.preco);

        btVoltar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				chamaMenuPrincipal();	  //Chama a tela de consulta 
				
			}
		}); 
    	
    }
    
    public void chamaMenuPrincipal(){
    	setContentView(R.layout.main);
    	 btAdicionarProduto = (Button) findViewById(R.id.btAdicionarProduto);
         btConsultar = (Button) findViewById(R.id.btConsultar);

         
         btAdicionarProduto.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {

 				chamaCadastro();	  //Chama a tela de cadastro 
 				
 			}
 		});
         
         
         btConsultar.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {

 				chamaConsulta();	  //Chama a tela de consulta 
 				
 			}
 		}); 
         
       
    }
    
    
}




//Criando Projeto App MinhaLista - IFPI - hilfranjr.wordpress.com
