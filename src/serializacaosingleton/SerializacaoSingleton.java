package serializacaosingleton;

import java.io.Serializable;

public class SerializacaoSingleton implements Serializable{

	private static final long serialVersionUID = -7604766932017737115L;

	private static SerializacaoSingleton serializacaosingleton = null;
	
	private String situacao = "teste";
	
    public String getSituacao() {
		return situacao;
	}


	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}


	private SerializacaoSingleton(){}

   
    public static  SerializacaoSingleton getSerializacaoSingleton() {
    	if (serializacaosingleton == null) {
    		
    		return new SerializacaoSingleton();
    	}else {
    		return serializacaosingleton;
    	}
    
    }
    
    
    protected Object readResolve() {
        return getSerializacaoSingleton();
    }

	
    

}
