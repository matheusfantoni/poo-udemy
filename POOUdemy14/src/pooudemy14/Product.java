
package pooudemy14;

public class Product {
    
        private String nome;
        private double price;
        private int quantity;
        
        
        
        
        public Product(){
            
        }
        
        public Product(String nome, double price, int quantity){
            
            this.nome = nome;
            this.price = price;
            this.quantity = quantity;
        }
        
         public Product(String nome, double price){
            
            this.nome = nome;
            this.price = price;
            
        }
         
         
         public void setName(String nome){
             this.nome = nome;
         }
         
         public String getNome(){
             return nome;
         }
         
         public double getPrice(){
             return price;
         }
         
         public void setPrice(double price){
             this.price = price;
         }
         
         public int getQuantity(){
             return quantity;
         }
         
        
        
        public double totalValueInStock(){
            return price * quantity;
        }
        
        public void addProducts(int quantity){
            this.quantity += quantity;
        }
        
        public void removeProducts(int quantity){
            this.quantity -= quantity;
        }
    
        public String toString(){
            
           return nome
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
        }
        
}
