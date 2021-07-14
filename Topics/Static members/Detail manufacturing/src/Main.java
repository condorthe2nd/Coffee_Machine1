class ManufacturingController {
    static int productNumber = 0;

    public static String requestProduct(String product) {
        productNumber++;
        return productNumber + ". Requested " + product;

    }

    public static int getNumberOfProducts() {
        return productNumber;
    }
}