�}��� l  �{B��{�wi3}	��"�ˉ�<�L4աg<i��gg���>�`�R1t�#~f 5r��\s���$�E��&�.��C'�j�84�r	G���X�`�O�����,���p����]���K$\4�p�1�+����MY��������N��ʕ���,��p�8.)Lk@�k*�em���~�~���@�A�D2�!
�<C�����*sRs��HlS��|�'(��Sg���5�k�����K8�!�ϙ2���4��	9���[CH����_N���)ߨ��.1f�6�Jw��_���[.��y��с�ZҸ��S�+:�Iy���c��s��m�A�3D_M9h<��+�f�ߛN�#���%k�29%Ic�g7p9��� ̓C!&n�fU)�@�#�?֊b�a�Ҥ�\�����q�/T���,��ҏ?p����&�|j)~�Q_ ��}˽��������O����i}��Ű'CZ���]%���RM��4�SL� a���{	   @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.yaxon.yxprotocol.test", appContext.getPackageName());
    }
}
