�}��� n  P�ˉ(�'i3}	��� ��i�=�L(���?��v`*��ob�3Y7����t�~��w�-�Ce%���yc��\Z)Gi�N� ��m{�D�x鲝Ե����Gp0��I��~J�ׄ�:�?� ��1{�6{Ȥ�ɑg�S�k���nv��}@�OH��E,m�-�`OB��G��uB���. ah2�ͺ�T5R�Tp�w���Ar��Y����Ix^<�Ķ��t��j�Hu�G/-瓍*.��<^��v�V�C�� �$��psf���]�C��j�h?�_)*�q��
Ak^/��<:�1���S�+:�Iy���c��s��m�A�3D_M9h<��+�f�ߛN�#���%k�29%Ic�g7p9��� ̓C!&n�fU)�@�#�?֊b�a�Ҥ�\�����q�/T���,��ҏ?p����&�|j)~�Q_ ��}˽��������O����i}��Ű'CZ���]%���RM��4�SL� a���{	l$R�&�U�n�s�Y�0;��m��-+�!� /J5���G�}�2y�� ��d��׈���Ɯ�V��>�&�����o��2l�.E\B�M"���C�%~n�I�t�V�����ۧ��ݝn5�܅R r�o���E�k�J� ���S鼄~�0�(RO�u�����I��F���C�����p��N�kؙ y�	��D��)r��A�!X�+�"�|����>��~p�Cİ�PY5��9����������}�F@��z8c��z;��*�,ٙՓ�u}H�ϸ���،�9�;�����Տ��Oz��v�o3�
���j�Ř}�|�_�C!y���ǳw9�v����J�O$��{5���1I�	�Lv)P�ko����3���瓤<e$����^#�r:�>+���œ��\nT']�`2]/58ݟPO��c��X�2i:�	F�pKɷyW4舷O��͉�������A�eHbW��/����ω��ݥ�:ɝ���
rname);
			json.put("passWord", password);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		RequestBody body = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), json.toString() );

		return retrofitService.login(body)
				.subscribeOn(Schedulers.io())// 在子线程中进行Http访问
				.observeOn(AndroidSchedulers.mainThread()); // UI线程处理返回接口
	}

}
