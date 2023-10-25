import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 

/**
 * Write a description of class rayden here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class slimeRed extends Actor
{
    private int alturaPulo = 30; // Altura do salto
    private int velocidadeQueda = 0; // Velocidade de queda
    private boolean estaNoChao = true; // Verifica se o ator está no chão
    public int sTimer = 0;
    public int speed = 5;
    public int vida = 10;
    public void act() {
         // Chama a função para lidar com o pulo
        lidarComPulo();

        // Verifica se o ator tocou no chão
        if (estaNoChao && Greenfoot.isKeyDown("up")) {
            // Inicia o pulo
            iniciarPulo();
        }

        // Atualiza a posição vertical do ator
        PosicaoVertical2();
        
        acertaralvo();
    } 
    private void lidarComPulo() {
        // Verifica se o ator está no chão
        if (estaNoChao) {
            // Reinicia a velocidade de queda
            velocidadeQueda = 0;
        } else {
            // Aplica a gravidade para a queda
            velocidadeQueda += 2; // Ajuste a gravidade conforme necessário
        }
    }
    private void iniciarPulo() {
        // Aplica uma força inicial para o pulo
        velocidadeQueda = -alturaPulo;
        estaNoChao = false;
    }
    private void PosicaoVertical2() {
        // Atualiza a posição vertical do ator
        setLocation(getX(), getY() + velocidadeQueda);

        // Verifica se o ator atingiu o chão
        if (getY() >= getWorld().getHeight() - getImage().getHeight() / 2) {
            estaNoChao = true;
            velocidadeQueda = 0;
            setLocation(getX(), getWorld().getHeight() - getImage().getHeight() / 2);
        }
        movimento();
    }
    public void movimento(){
        int speed = 5;
           if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
           if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        if(Greenfoot.isKeyDown("l")&&(sTimer == 0)){
            sTimer ++;
            getWorld().addObject(new atackRed(), getX() -50,
            getY() +30);
        } else {
            if(!Greenfoot.isKeyDown("l" ))
            sTimer = 0;
        }
    }
    public void acertaralvo() {
        Actor b = getOneIntersectingObject(slimeGreen.class);
        if (b !=null){
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
            vida -=1;
            getWorld().removeObject(b);
        } else if(vida == 0 ){
            getWorld().removeObject(this);
        }
    }
}
