�}.�� p  �D��!l�i3}	���ˑ�=�L4Ձ�� b��t1�׮ >iߺ�Y��[Y��鰣���}�M�����z�FØ��SY�O`�����A&����MUt�-�R���#3[ݜ�T�K4lư�T����� ���l�6W@�i�����WJ���^��M-��d+4�<���3��y �����ɴ-�Y��}���\�wo���Kf�˫���ј�\�kc��6c5��z���/ӥ�s�R�B�5z�ZA�Do�,&����;s��]�%�+����^�`�+�f9
Ak^/��<:�1���S�+:�Iy���c��s��m�A�3D_M9h<��+�f�ߛN�#���%k�29%Ic�g7p9��� ̓C!&n�fU)�@�#�?֊b�a�Ҥ�\�����q�/T���,��ҏ?p����&�|j)~�Q_ ��}˽��������O����i}��Ű'CZ���]%���RM��4�SL� a���{	tHelper;
	}

	private RetrofitHelper() {
		// 初始化Retrofit
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(Constant.URL.HOST)
				.addConverterFactory(GsonConverterFactory.create()) // json解析
				.addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // 支持RxJava
				.build();
		retrofitService = retrofit.create(RetrofitService.class);
	}

	public RetrofitService getRetrofitService() {
		return retrofitService;
	}
}
