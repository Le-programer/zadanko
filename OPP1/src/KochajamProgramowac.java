public interface KochajamProgramowac {
    void programuj();
    KochajamProgramowac programuje = new KochajamProgramowac() {
        @Override
        public void programuj() {
            System.out.println("woooooo programuej jestem pogramista");
        }
    };
}
