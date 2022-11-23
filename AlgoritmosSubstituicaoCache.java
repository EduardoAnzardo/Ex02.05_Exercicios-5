/**
 * Ex02.05 - Exercícios V
 *
 * Desenvolva os algoritmos de substituição de páginas FIFO, LFU LRU e NRU.
 * O algoritmo deverá receber por parâmetro a lista de frames alocadas na memória principal.
 * Cada frame contêm as informações de ID, tempo de carga, quantidade de referências, tempo da última referência, BR e BM.
 * Por exemplo:
 *
 * +------------------------------------------------------------------------------+
 * | Frame Tempo da Carga Quantidade Referências Tempo da Última Referência BR BM |
 * | 1     12             10                     20                         1  1  |
 * | 2     10             1                      12                         0  0  |
 * | 3     11             2                      21                         1  0  |
 * +------------------------------------------------------------------------------+
 *
 * . O algoritmo deverá retornar o ID do frame que deverá ser substituído.
 * . O algoritmo deverá receber por parâmetro a lista de frames alocados.
 * . O algoritmo deverá retornar o ID do frame a ser substituído.
 * . O algoritmo deverá ser testado com diferentes listas de páginas.
 * . Os algoritmos podem ser desenvolvidos em qualquer linguagem de programação
 **/
public class AlgoritmosSubstituicaoCache {
    public static void main(String[] args) {
        int Frame1 = 1;
        int Frame2 = 2;
        int Frame3 = 3;
        int TempoCargaFrame1 = 12;
        int TempoCargaFrame2 = 10;
        int TempoCargaFrame3 = 11;
        int QuantidadeReferenciasFrame1 = 10;
        int QuantidadeReferenciasFrame2 = 1;
        int QuantidadeReferenciasFrame3 = 2;
        int TempoUltimaReferenciaFrame1 = 20;
        int TempoUltimaReferenciaFrame2 = 12;
        int TempoUltimaReferenciaFrame3 = 21;
        int BRFrame1 = 1;
        int BRFrame2 = 0;
        int BRFrame3 = 1;
        int BMFrame1 = 1;
        int BMFrame2 = 0;
        int BMFrame3 = 0;

        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;

        int soma1 = 0;
        int soma2 = 0;
        int soma4 = 0;
        int soma3 = 0;
        int soma5 = 0;
        int soma6 = 0;
        int soma7 = 0;
        int soma8 = 0;
        int soma9 = 0;
        int soma10 = 0;

// FIFO ================================================================================
        System.out.print("========== FIFO ==========");
        // Frame 1
        System.out.println();
        System.out.print("Frame1 |");
        while (i11 < TempoCargaFrame1) {
            System.out.print("_");
            i11++;
        }

        // Frame 2
        System.out.println();
        System.out.print("Frame2 |");
        System.out.print(" ");
        while (i12 < TempoCargaFrame1) {
            System.out.print(" ");
            i12++;
        }
        while (i13 < TempoCargaFrame2) {
            System.out.print("_");
            i13++;
        }

        // Frame 3
        System.out.println();
        System.out.print("Frame3 |");
        soma1 = TempoCargaFrame1 + TempoCargaFrame2;
        while (i14 < soma1) {
            System.out.print(" ");
            i14++;
        }
        System.out.print("  ");
        while (i15 < TempoCargaFrame3) {
            System.out.print("_");
            i15++;
        }
        System.out.println();
        System.out.println();

// LFU ================================================================================
        System.out.println("========== LFU ==========");
// Frame 1 ================================================================================
        if (QuantidadeReferenciasFrame1 < QuantidadeReferenciasFrame2 && QuantidadeReferenciasFrame1 < QuantidadeReferenciasFrame3) {
            System.out.print("Frame1 |");
            while (i21 < QuantidadeReferenciasFrame1) {
                System.out.print("_");
                i21++;

            }

            System.out.println();
            System.out.print("Frame2 |");
            while (i22 < QuantidadeReferenciasFrame1) {
                System.out.print(" ");
                i22++;

            }

            while (i23 < QuantidadeReferenciasFrame2) {
                System.out.print("_");
                i23++;

            }

            System.out.println();

            System.out.print("Frame3 |");
            soma1 = QuantidadeReferenciasFrame1 + QuantidadeReferenciasFrame2;
            while (i24 < soma1) {
                System.out.print(" ");
                i24++;
            }

            while (i25 < QuantidadeReferenciasFrame3) {
                System.out.print("_");
                i25++;
            }

            System.out.println();
        }

// Frame 2 ================================================================================
        if (QuantidadeReferenciasFrame2 < QuantidadeReferenciasFrame1 && QuantidadeReferenciasFrame2 < QuantidadeReferenciasFrame3) {
            System.out.print("Frame1 |");
            soma2 = QuantidadeReferenciasFrame2 + QuantidadeReferenciasFrame3;
            while (i26 < soma2) {
                System.out.print(" ");
                i26++;

            }

            while (i21 < QuantidadeReferenciasFrame1) {
                System.out.print("_");
                i21++;
            }

            System.out.println();

            System.out.print("Frame2 |");
            while (i23 < QuantidadeReferenciasFrame2) {
                System.out.print("_");
                i23++;
            }

            System.out.println();
            System.out.print("Frame3 |");
            while (i27 < QuantidadeReferenciasFrame2) {
                System.out.print(" ");
                i27++;
            }

            while (i25 < QuantidadeReferenciasFrame3) {
                System.out.print("_");
                i25++;
            }

            System.out.println();

        }

// Frame 3 ================================================================================
        else if (QuantidadeReferenciasFrame3 < QuantidadeReferenciasFrame1 && QuantidadeReferenciasFrame3 < QuantidadeReferenciasFrame2) {
            System.out.print("Frame1 |");
            while (i28 < QuantidadeReferenciasFrame3) {
                System.out.print(" ");
                i28++;
            }

            while (i21 < QuantidadeReferenciasFrame1) {
                System.out.print("_");
                i21++;
            }

            System.out.println();
            System.out.print("Frame2 |");
            while (i23 < QuantidadeReferenciasFrame2) {
                System.out.print("_");
                i23++;
            }

            System.out.println();
            System.out.print("Frame3 |");
            soma4 = QuantidadeReferenciasFrame1 + QuantidadeReferenciasFrame2;
            while (i29 < soma4) {
                System.out.print(" ");
                i29++;
            }

            while (i25 < QuantidadeReferenciasFrame3) {
                System.out.print("_");
                i25++;
            }

            System.out.println();
            System.out.println();
        }

// LRU ========================================
// Frame1 ========================================
        System.out.print("========== LRU ==========");
        if(TempoUltimaReferenciaFrame1 < TempoUltimaReferenciaFrame2 && TempoUltimaReferenciaFrame1 < TempoUltimaReferenciaFrame3) {
            System.out.println();
            System.out.print("Frame1 |");

            while (i31 < TempoUltimaReferenciaFrame1) {
                System.out.print("_");
                i31++;
            }

// Frame2  ========================================
            System.out.println();
            System.out.print("Frame2 |");
            while (i30 < TempoUltimaReferenciaFrame1) {
                System.out.print(" ");
                i30++;
            }
            while (i32 < TempoUltimaReferenciaFrame2) {
                System.out.print("_");
                i32++;
            }

// Frame3  ========================================
            System.out.println();
            System.out.print("Frame3 |");
            soma4 = TempoUltimaReferenciaFrame1 + TempoUltimaReferenciaFrame2;
            while (i33 < soma4) {
                System.out.print(" ");
                i33++;
            }
            while (i34 < TempoUltimaReferenciaFrame3) {
                System.out.print("_");
                i34++;
            }

        }

        System.out.println();

// Frame2 ========================================
        if(TempoUltimaReferenciaFrame2 < TempoUltimaReferenciaFrame1 && TempoUltimaReferenciaFrame2 < TempoUltimaReferenciaFrame3) {
            System.out.println();
            System.out.print("Frame1 |");
            while (i35 < TempoUltimaReferenciaFrame2) {
                System.out.print(" ");
                i35++;
            }

            while (i36 < TempoUltimaReferenciaFrame1) {
                System.out.print("_");
                i36++;
            }

// Frame2  ========================================
            System.out.println();
            System.out.print("Frame2 |");

            while (i37 < TempoUltimaReferenciaFrame2) {
                System.out.print("_");
                i37++;
            }

// Frame3  ========================================
            System.out.println();
            System.out.print("Frame3 |");
            soma4 = TempoUltimaReferenciaFrame1 + TempoUltimaReferenciaFrame2;
            while (i38 < soma4) {
                System.out.print(" ");
                i38++;
            }
            while (i39 < TempoUltimaReferenciaFrame3) {
                System.out.print("_");
                i39++;
            }

        }

        System.out.println();

// Frame3 ========================================
        if(TempoUltimaReferenciaFrame3 < TempoUltimaReferenciaFrame1 && TempoUltimaReferenciaFrame3 < TempoUltimaReferenciaFrame2) {
            System.out.println();
            System.out.print("Frame1 | ");
            soma3 = TempoUltimaReferenciaFrame2 + TempoUltimaReferenciaFrame3;
            while (i40 < soma3) {
                System.out.print(" ");
                i40++;
            }

            while (i41 < TempoUltimaReferenciaFrame1) {
                System.out.print("_");
                i41++;
            }

// Frame2  ========================================
            System.out.println();
            System.out.print("Frame2 | ");
            while (i42 < TempoUltimaReferenciaFrame3) {
                System.out.print(" ");
                i42++;
            }
            while (i43 < TempoUltimaReferenciaFrame2) {
                System.out.print("_");
                i43++;
            }

// Frame3  ========================================
            System.out.println();
            System.out.print("Frame3 | ");
            while (i34 < TempoUltimaReferenciaFrame3) {
                System.out.print("_");
                i34++;
            }

        }

        System.out.println();


// NRU ========================================
// Frame1 Frame1  ========================================
        System.out.print("========== NRU ==========");
            System.out.println();
            System.out.print("Frame1 | ");
            
            while (i48 < BRFrame3) {
                System.out.print("  ");
                i48++;
            }

            while (i49 < BRFrame1) {
                System.out.print("__");
                i49++;
            }

// Frame2 Frame1  ========================================
            System.out.println();
            System.out.print("Frame2 | ");

            while (i45 < BRFrame2) {
                System.out.print("_");
                i45++;
            }

// Frame3 Frame1  ========================================
            System.out.println();
            System.out.print("Frame3 | ");
            while (i47 < BRFrame3) {
                System.out.print(" ");
                i47++;
            }
            while (i46 < BRFrame3) {
                System.out.print("_");
                i46++;
            }

        }

//        System.out.println();

    }

