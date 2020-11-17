package HWPresentation.LivelockExample;

public class Worker {

    private String name;
    private boolean active;

    public Worker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void work(CommonResource commonResource, Worker otherWorker) {
        while (active) {
            // Ожидание поке ресурс станет доступен.
            if (commonResource.getOwner() != this) {
                try {
                    wait(10);
                } catch (InterruptedException e) {
                }
                continue;
            }

            // Если другой рабочий также активен, пусть он сначала сделает свою работу.
            if (otherWorker.isActive()) {
                System.out.println(getName() + " : передача ресурса работнику: " +
                        otherWorker.getName());
                commonResource.setOwner(otherWorker);
                continue;
            }

            // Теперь используйте общий ресурс.
            System.out.println(getName() + ": работа с обищим ресурсом");
            active = false;
            commonResource.setOwner(otherWorker);
        }
    }
}
